package calendar.api.builder.internal.graphql.servlet.v1_0;

import calendar.api.builder.internal.graphql.mutation.v1_0.Mutation;
import calendar.api.builder.internal.graphql.query.v1_0.Query;
import calendar.api.builder.internal.resource.v1_0.BookingResourceImpl;
import calendar.api.builder.resource.v1_0.BookingResource;

import com.liferay.portal.kernel.util.ObjectValuePair;
import com.liferay.portal.vulcan.graphql.servlet.ServletData;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;

/**
 * @author frup84759
 * @generated
 */
@Component(service = ServletData.class)
@Generated("")
public class ServletDataImpl implements ServletData {

	@Activate
	public void activate(BundleContext bundleContext) {
		Mutation.setBookingResourceComponentServiceObjects(
			_bookingResourceComponentServiceObjects);

		Query.setBookingResourceComponentServiceObjects(
			_bookingResourceComponentServiceObjects);
	}

	public String getApplicationName() {
		return "CalendarApiBuilder";
	}

	@Override
	public Mutation getMutation() {
		return new Mutation();
	}

	@Override
	public String getPath() {
		return "/calendar-api-builder-graphql/v1_0";
	}

	@Override
	public Query getQuery() {
		return new Query();
	}

	public ObjectValuePair<Class<?>, String> getResourceMethodObjectValuePair(
		String methodName, boolean mutation) {

		if (mutation) {
			return _resourceMethodObjectValuePairs.get(
				"mutation#" + methodName);
		}

		return _resourceMethodObjectValuePairs.get("query#" + methodName);
	}

	private static final Map<String, ObjectValuePair<Class<?>, String>>
		_resourceMethodObjectValuePairs =
			new HashMap<String, ObjectValuePair<Class<?>, String>>() {
				{
					put(
						"mutation#addBooking",
						new ObjectValuePair<>(
							BookingResourceImpl.class, "addBooking"));

					put(
						"query#bookings",
						new ObjectValuePair<>(
							BookingResourceImpl.class, "getBookings"));
				}
			};

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<BookingResource>
		_bookingResourceComponentServiceObjects;

}