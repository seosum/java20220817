package ch13.ex.Q3;

public class Container<T,M> {
	private T name;
	private M job;
	
	public T getName() {
		return name;
	}
	
	public void setName(T name) {
		this.name = name;
	}
	
	public M getJob() {
		return job;
	}
	
	public void setJob(M job) {
		this.job = job;
	}
}
