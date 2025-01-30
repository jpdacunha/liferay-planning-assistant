package calendar.api.builder.client.serdes.v1_0;

import calendar.api.builder.client.dto.v1_0.Booking;
import calendar.api.builder.client.json.BaseJSONParser;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Generated;

/**
 * @author frup84759
 * @generated
 */
@Generated("")
public class BookingSerDes {

	public static Booking toDTO(String json) {
		BookingJSONParser bookingJSONParser = new BookingJSONParser();

		return bookingJSONParser.parseToDTO(json);
	}

	public static Booking[] toDTOs(String json) {
		BookingJSONParser bookingJSONParser = new BookingJSONParser();

		return bookingJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Booking booking) {
		if (booking == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (booking.getDateOrder() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dateOrder\": ");

			sb.append("\"");

			sb.append(_escape(booking.getDateOrder()));

			sb.append("\"");
		}

		if (booking.getEndTime() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"endTime\": ");

			sb.append("\"");

			sb.append(_escape(booking.getEndTime()));

			sb.append("\"");
		}

		if (booking.getOrderAdress() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"orderAdress\": ");

			sb.append("\"");

			sb.append(_escape(booking.getOrderAdress()));

			sb.append("\"");
		}

		if (booking.getOrderId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"orderId\": ");

			sb.append(booking.getOrderId());
		}

		if (booking.getStartTime() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"startTime\": ");

			sb.append("\"");

			sb.append(_escape(booking.getStartTime()));

			sb.append("\"");
		}

		if (booking.getVehicleId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"vehicleId\": ");

			sb.append(booking.getVehicleId());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		BookingJSONParser bookingJSONParser = new BookingJSONParser();

		return bookingJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(Booking booking) {
		if (booking == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (booking.getDateOrder() == null) {
			map.put("dateOrder", null);
		}
		else {
			map.put("dateOrder", String.valueOf(booking.getDateOrder()));
		}

		if (booking.getEndTime() == null) {
			map.put("endTime", null);
		}
		else {
			map.put("endTime", String.valueOf(booking.getEndTime()));
		}

		if (booking.getOrderAdress() == null) {
			map.put("orderAdress", null);
		}
		else {
			map.put("orderAdress", String.valueOf(booking.getOrderAdress()));
		}

		if (booking.getOrderId() == null) {
			map.put("orderId", null);
		}
		else {
			map.put("orderId", String.valueOf(booking.getOrderId()));
		}

		if (booking.getStartTime() == null) {
			map.put("startTime", null);
		}
		else {
			map.put("startTime", String.valueOf(booking.getStartTime()));
		}

		if (booking.getVehicleId() == null) {
			map.put("vehicleId", null);
		}
		else {
			map.put("vehicleId", String.valueOf(booking.getVehicleId()));
		}

		return map;
	}

	public static class BookingJSONParser extends BaseJSONParser<Booking> {

		@Override
		protected Booking createDTO() {
			return new Booking();
		}

		@Override
		protected Booking[] createDTOArray(int size) {
			return new Booking[size];
		}

		@Override
		protected void setField(
			Booking booking, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "dateOrder")) {
				if (jsonParserFieldValue != null) {
					booking.setDateOrder((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "endTime")) {
				if (jsonParserFieldValue != null) {
					booking.setEndTime((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "orderAdress")) {
				if (jsonParserFieldValue != null) {
					booking.setOrderAdress((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "orderId")) {
				if (jsonParserFieldValue != null) {
					booking.setOrderId(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "startTime")) {
				if (jsonParserFieldValue != null) {
					booking.setStartTime((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "vehicleId")) {
				if (jsonParserFieldValue != null) {
					booking.setVehicleId(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
		}

	}

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		for (String[] strings : BaseJSONParser.JSON_ESCAPE_STRINGS) {
			string = string.replace(strings[0], strings[1]);
		}

		return string;
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
			sb.append(entry.getKey());
			sb.append("\": ");

			Object value = entry.getValue();

			Class<?> valueClass = value.getClass();

			if (value instanceof Map) {
				sb.append(_toJSON((Map)value));
			}
			else if (valueClass.isArray()) {
				Object[] values = (Object[])value;

				sb.append("[");

				for (int i = 0; i < values.length; i++) {
					sb.append("\"");
					sb.append(_escape(values[i]));
					sb.append("\"");

					if ((i + 1) < values.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(entry.getValue()));
				sb.append("\"");
			}
			else {
				sb.append(String.valueOf(entry.getValue()));
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

}