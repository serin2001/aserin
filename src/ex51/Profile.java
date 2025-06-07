package ex51;

public class Profile {
	private ShippingInfo shippingInfo;

	public Profile(ShippingInfo shippingInfo) {
		this.shippingInfo = shippingInfo;
	}

	public ShippingInfo getShippingInfo() {
		return shippingInfo;
	}

	public void setShippingInfo(ShippingInfo shippingInfo) {
		this.shippingInfo = shippingInfo;
	}
}
