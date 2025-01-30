package calendar.api.builder.internal.graphql.query.v1_0;

import calendar.api.builder.dto.v1_0.Booking;
import calendar.api.builder.resource.v1_0.BookingResource;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.pagination.Page;

import java.util.Map;
import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author frup84759
 * @generated
 */
@Generated("")
public class Query {

	public static void setBookingResourceComponentServiceObjects(
		ComponentServiceObjects<BookingResource>
			bookingResourceComponentServiceObjects) {

		_bookingResourceComponentServiceObjects =
			bookingResourceComponentServiceObjects;
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {bookings(orderDate: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField(description = "Retrieves a list of calendar bookings.")
	public BookingPage bookings(@GraphQLName("orderDate") String orderDate)
		throws Exception {

		return _applyComponentServiceObjects(
			_bookingResourceComponentServiceObjects,
			this::_populateResourceContext,
			bookingResource -> new BookingPage(
				bookingResource.getBookings(orderDate)));
	}

	@GraphQLName("BookingPage")
	public class BookingPage {

		public BookingPage(Page bookingPage) {
			actions = bookingPage.getActions();

			items = bookingPage.getItems();
			lastPage = bookingPage.getLastPage();
			page = bookingPage.getPage();
			pageSize = bookingPage.getPageSize();
			totalCount = bookingPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map<String, String>> actions;

		@GraphQLField
		protected java.util.Collection<Booking> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(BookingResource bookingResource)
		throws Exception {

		bookingResource.setContextAcceptLanguage(_acceptLanguage);
		bookingResource.setContextCompany(_company);
		bookingResource.setContextHttpServletRequest(_httpServletRequest);
		bookingResource.setContextHttpServletResponse(_httpServletResponse);
		bookingResource.setContextUriInfo(_uriInfo);
		bookingResource.setContextUser(_user);
		bookingResource.setGroupLocalService(_groupLocalService);
		bookingResource.setRoleLocalService(_roleLocalService);
	}

	private static ComponentServiceObjects<BookingResource>
		_bookingResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private com.liferay.portal.kernel.model.Company _company;
	private BiFunction<Object, String, Filter> _filterBiFunction;
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;

}