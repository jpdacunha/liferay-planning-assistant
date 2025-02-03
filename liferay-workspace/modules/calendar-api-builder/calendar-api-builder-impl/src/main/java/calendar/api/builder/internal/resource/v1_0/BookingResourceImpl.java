package calendar.api.builder.internal.resource.v1_0;

import calendar.api.builder.dto.v1_0.Booking;
import calendar.api.builder.resource.v1_0.BookingResource;

import com.liferay.calendar.constants.CalendarBookingConstants;
import com.liferay.calendar.model.Calendar;
import com.liferay.calendar.model.CalendarBooking;
import com.liferay.calendar.service.CalendarBookingService;
import com.liferay.calendar.service.CalendarLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.vulcan.pagination.Page;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.ws.rs.core.Response;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author mohamed.hamami
 */
@Component(properties = "OSGI-INF/liferay/rest/v1_0/booking.properties", scope = ServiceScope.PROTOTYPE, service = BookingResource.class)
public class BookingResourceImpl extends BaseBookingResourceImpl {
	
	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	
	@Override
	public Page<Booking> getBookings(String orderDate) throws Exception {
		List<Booking> bookings= new ArrayList<>();
		//Get all calendars
		List<Calendar> calendars=_calendarService.getCalendars(-1, -1);
		for (Calendar calendar : calendars) {
			java.util.Calendar startTime = java.util.Calendar.getInstance();
			java.util.Calendar endTime = java.util.Calendar.getInstance();
			startTime.setTime(dateFormat.parse(orderDate + " 00:00"));
			endTime.setTime(dateFormat.parse(orderDate + " 23:59"));
			
			//Get all calendar bookings of calendar
			List<CalendarBooking> calendarBookings=_calendarBookingService.getCalendarBookings(calendar.getCalendarId(), startTime.getTimeInMillis(), endTime.getTimeInMillis());
			
			for (CalendarBooking calendarBooking : calendarBookings) {
				//if not deleted
				if(calendarBooking.getStatus()!=8) {
					Booking booking= new Booking();
					booking.setDateOrder(orderDate);
					booking.setStartTime(dateFormat.format(calendarBooking.getStartTime()));
					booking.setEndTime(dateFormat.format(calendarBooking.getEndTime()));
					booking.setOrderAdress(calendarBooking.getDescription(LocaleUtil.getSiteDefault()));
					booking.setVehicleId((int) calendarBooking.getCalendarId());
					booking.setOrderId(Integer.parseInt(calendarBooking.getTitle(LocaleUtil.getSiteDefault()))); 
					bookings.add(booking);
				}
			}
		}
		
		return Page.of(bookings);
	}

	@Override
	public Response addBooking(Booking booking) throws Exception {
		
		addCalendarBooking(booking);
		return super.addBooking(booking);
	}

	private void addCalendarBooking(Booking booking)
			throws Exception {
		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
		
		Map<Locale, String> titleMap = new HashMap<>();
		titleMap.put(LocaleUtil.getSiteDefault(),Long.toString(booking.getOrderId()));
		Map<Locale, String> descriptionMap = new HashMap<>();
		descriptionMap.put(LocaleUtil.getSiteDefault(),booking.getOrderAdress());
		String location = null;
		long[] reminders = { 0, 0 };
		String[] remindersType = { "email", "email" };
		java.util.Calendar startTimeJCalendar = java.util.Calendar.getInstance();
		java.util.Calendar endTimeJCalendar = java.util.Calendar.getInstance();
		startTimeJCalendar.setTime(dateFormat.parse(booking.getDateOrder() + " " + booking.getStartTime()));
		endTimeJCalendar.setTime(dateFormat.parse(booking.getDateOrder() + " " + booking.getEndTime()));
		long[] childCalendarIds = {};

		_calendarBookingService.addCalendarBooking(booking.getVehicleId(), // calendarId
				childCalendarIds, // childCalendarIds
				CalendarBookingConstants.PARENT_CALENDAR_BOOKING_ID_DEFAULT,
				CalendarBookingConstants.RECURRING_CALENDAR_BOOKING_ID_DEFAULT, titleMap, descriptionMap, location,
				startTimeJCalendar.getTimeInMillis(), // startTime
				endTimeJCalendar.getTimeInMillis(), // endTime
				false, // allDay
				null, // recurrence
				reminders[0], remindersType[0], reminders[1], remindersType[1], serviceContext);
	}

	@Reference
	private CalendarBookingService _calendarBookingService;

	@Reference
	private CalendarLocalService _calendarService;
}