package ch11;

public interface RemoteControllable extends Controllable{
	//같은 인터페이스인 Contrallable을 상속받음.
	void remoteOn();
	void remoteOff();

}
