public class Exceptions
{

	@SuppressWarnings("unchecked")
	// Lost the source :(
	public static <T extends Throwable> RuntimeException rethrowUnchecked(Throwable throwable) throws T {
		throw (T) throwable; // rely on vacuous cast
	}
}
