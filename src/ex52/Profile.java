package ex52;

public class Profile {
	private ShippingInfo shippingInfo;

	public Profile(ShippingInfo shippingInfo) throws MissingShippingInfoException {
		if (shippingInfo == null) {
            throw new MissingShippingInfoException("ShippingInfo cannot be null.");
        }
		this.shippingInfo = shippingInfo;
	}

	public ShippingInfo getShippingInfo() {
		return shippingInfo;
	}

	public void setShippingInfo(ShippingInfo shippingInfo) {
		this.shippingInfo = shippingInfo;
	}
}
