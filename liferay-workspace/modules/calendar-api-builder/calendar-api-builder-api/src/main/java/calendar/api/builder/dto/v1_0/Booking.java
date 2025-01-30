package calendar.api.builder.dto.v1_0;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.util.ObjectMapperUtil;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;

import javax.annotation.Generated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author frup84759
 * @generated
 */
@Generated("")
@GraphQLName("Booking")
@JsonFilter("Liferay.Vulcan")
@Schema(
	requiredProperties = {
		"startTime", "endTime", "dateOrder", "vehicleId", "orderId",
		"orderAdress"
	}
)
@XmlRootElement(name = "Booking")
public class Booking implements Serializable {

	public static Booking toDTO(String json) {
		return ObjectMapperUtil.readValue(Booking.class, json);
	}

	public static Booking unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Booking.class, json);
	}

	@Schema(description = "The order date")
	public String getDateOrder() {
		if (_dateOrderSupplier != null) {
			dateOrder = _dateOrderSupplier.get();

			_dateOrderSupplier = null;
		}

		return dateOrder;
	}

	public void setDateOrder(String dateOrder) {
		this.dateOrder = dateOrder;

		_dateOrderSupplier = null;
	}

	@JsonIgnore
	public void setDateOrder(
		UnsafeSupplier<String, Exception> dateOrderUnsafeSupplier) {

		_dateOrderSupplier = () -> {
			try {
				return dateOrderUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField(description = "The order date")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	@NotEmpty
	protected String dateOrder;

	@JsonIgnore
	private Supplier<String> _dateOrderSupplier;

	@Schema(description = "The end time of the booking")
	public String getEndTime() {
		if (_endTimeSupplier != null) {
			endTime = _endTimeSupplier.get();

			_endTimeSupplier = null;
		}

		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;

		_endTimeSupplier = null;
	}

	@JsonIgnore
	public void setEndTime(
		UnsafeSupplier<String, Exception> endTimeUnsafeSupplier) {

		_endTimeSupplier = () -> {
			try {
				return endTimeUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField(description = "The end time of the booking")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	@NotEmpty
	protected String endTime;

	@JsonIgnore
	private Supplier<String> _endTimeSupplier;

	@Schema(description = "The adress of the order")
	public String getOrderAdress() {
		if (_orderAdressSupplier != null) {
			orderAdress = _orderAdressSupplier.get();

			_orderAdressSupplier = null;
		}

		return orderAdress;
	}

	public void setOrderAdress(String orderAdress) {
		this.orderAdress = orderAdress;

		_orderAdressSupplier = null;
	}

	@JsonIgnore
	public void setOrderAdress(
		UnsafeSupplier<String, Exception> orderAdressUnsafeSupplier) {

		_orderAdressSupplier = () -> {
			try {
				return orderAdressUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField(description = "The adress of the order")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	@NotEmpty
	protected String orderAdress;

	@JsonIgnore
	private Supplier<String> _orderAdressSupplier;

	@Schema(description = "The ID of the command")
	public Integer getOrderId() {
		if (_orderIdSupplier != null) {
			orderId = _orderIdSupplier.get();

			_orderIdSupplier = null;
		}

		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;

		_orderIdSupplier = null;
	}

	@JsonIgnore
	public void setOrderId(
		UnsafeSupplier<Integer, Exception> orderIdUnsafeSupplier) {

		_orderIdSupplier = () -> {
			try {
				return orderIdUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField(description = "The ID of the command")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	@NotNull
	protected Integer orderId;

	@JsonIgnore
	private Supplier<Integer> _orderIdSupplier;

	@Schema(description = "The start time of the booking")
	public String getStartTime() {
		if (_startTimeSupplier != null) {
			startTime = _startTimeSupplier.get();

			_startTimeSupplier = null;
		}

		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;

		_startTimeSupplier = null;
	}

	@JsonIgnore
	public void setStartTime(
		UnsafeSupplier<String, Exception> startTimeUnsafeSupplier) {

		_startTimeSupplier = () -> {
			try {
				return startTimeUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField(description = "The start time of the booking")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	@NotEmpty
	protected String startTime;

	@JsonIgnore
	private Supplier<String> _startTimeSupplier;

	@Schema(description = "The ID of the vehicle")
	public Integer getVehicleId() {
		if (_vehicleIdSupplier != null) {
			vehicleId = _vehicleIdSupplier.get();

			_vehicleIdSupplier = null;
		}

		return vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;

		_vehicleIdSupplier = null;
	}

	@JsonIgnore
	public void setVehicleId(
		UnsafeSupplier<Integer, Exception> vehicleIdUnsafeSupplier) {

		_vehicleIdSupplier = () -> {
			try {
				return vehicleIdUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField(description = "The ID of the vehicle")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	@NotNull
	protected Integer vehicleId;

	@JsonIgnore
	private Supplier<Integer> _vehicleIdSupplier;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Booking)) {
			return false;
		}

		Booking booking = (Booking)object;

		return Objects.equals(toString(), booking.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		String dateOrder = getDateOrder();

		if (dateOrder != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dateOrder\": ");

			sb.append("\"");

			sb.append(_escape(dateOrder));

			sb.append("\"");
		}

		String endTime = getEndTime();

		if (endTime != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"endTime\": ");

			sb.append("\"");

			sb.append(_escape(endTime));

			sb.append("\"");
		}

		String orderAdress = getOrderAdress();

		if (orderAdress != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"orderAdress\": ");

			sb.append("\"");

			sb.append(_escape(orderAdress));

			sb.append("\"");
		}

		Integer orderId = getOrderId();

		if (orderId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"orderId\": ");

			sb.append(orderId);
		}

		String startTime = getStartTime();

		if (startTime != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"startTime\": ");

			sb.append("\"");

			sb.append(_escape(startTime));

			sb.append("\"");
		}

		Integer vehicleId = getVehicleId();

		if (vehicleId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"vehicleId\": ");

			sb.append(vehicleId);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "calendar.api.builder.dto.v1_0.Booking",
		name = "x-class-name"
	)
	public String xClassName;

	private static String _escape(Object object) {
		return StringUtil.replace(
			String.valueOf(object), _JSON_ESCAPE_STRINGS[0],
			_JSON_ESCAPE_STRINGS[1]);
	}

	private static boolean _isArray(Object value) {
		if (value == null) {
			return false;
		}

		Class<?> clazz = value.getClass();

		return clazz.isArray();
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(_escape(entry.getKey()));
			sb.append("\": ");

			Object value = entry.getValue();

			if (_isArray(value)) {
				sb.append("[");

				Object[] valueArray = (Object[])value;

				for (int i = 0; i < valueArray.length; i++) {
					if (valueArray[i] instanceof String) {
						sb.append("\"");
						sb.append(valueArray[i]);
						sb.append("\"");
					}
					else {
						sb.append(valueArray[i]);
					}

					if ((i + 1) < valueArray.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof Map) {
				sb.append(_toJSON((Map<String, ?>)value));
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(value));
				sb.append("\"");
			}
			else {
				sb.append(value);
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

	private static final String[][] _JSON_ESCAPE_STRINGS = {
		{"\\", "\"", "\b", "\f", "\n", "\r", "\t"},
		{"\\\\", "\\\"", "\\b", "\\f", "\\n", "\\r", "\\t"}
	};

	private Map<String, Serializable> _extendedProperties;

}