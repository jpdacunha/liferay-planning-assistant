package calendar.api.builder.client.dto.v1_0;

import calendar.api.builder.client.function.UnsafeSupplier;
import calendar.api.builder.client.serdes.v1_0.BookingSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author frup84759
 * @generated
 */
@Generated("")
public class Booking implements Cloneable, Serializable {

	public static Booking toDTO(String json) {
		return BookingSerDes.toDTO(json);
	}

	public String getDateOrder() {
		return dateOrder;
	}

	public void setDateOrder(String dateOrder) {
		this.dateOrder = dateOrder;
	}

	public void setDateOrder(
		UnsafeSupplier<String, Exception> dateOrderUnsafeSupplier) {

		try {
			dateOrder = dateOrderUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String dateOrder;

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public void setEndTime(
		UnsafeSupplier<String, Exception> endTimeUnsafeSupplier) {

		try {
			endTime = endTimeUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String endTime;

	public String getOrderAdress() {
		return orderAdress;
	}

	public void setOrderAdress(String orderAdress) {
		this.orderAdress = orderAdress;
	}

	public void setOrderAdress(
		UnsafeSupplier<String, Exception> orderAdressUnsafeSupplier) {

		try {
			orderAdress = orderAdressUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String orderAdress;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public void setOrderId(
		UnsafeSupplier<Integer, Exception> orderIdUnsafeSupplier) {

		try {
			orderId = orderIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer orderId;

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public void setStartTime(
		UnsafeSupplier<String, Exception> startTimeUnsafeSupplier) {

		try {
			startTime = startTimeUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String startTime;

	public Integer getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public void setVehicleId(
		UnsafeSupplier<Integer, Exception> vehicleIdUnsafeSupplier) {

		try {
			vehicleId = vehicleIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer vehicleId;

	@Override
	public Booking clone() throws CloneNotSupportedException {
		return (Booking)super.clone();
	}

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
		return BookingSerDes.toJSON(this);
	}

}