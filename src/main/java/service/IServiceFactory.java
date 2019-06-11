package service;

public class IServiceFactory {
	public static IService getIServiceImpl() {
		return new IServiceImpl();
	}
}
