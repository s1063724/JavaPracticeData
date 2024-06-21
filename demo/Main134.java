import java.util.concurrent.*;
public class Mian134{
	public static void main(String[]args)throws Exception{
		int size = 4*1024*1024;
		long []data=new long[size];
		for(int i=0;i<size;i++){
			data[i]=ThreadLocalRandom.current().nextLong();
		}
		ForkJoinPool pool = ForkJoinPool.commonPool();
		Foo f = new Foo(data, 0, data.length-1, data.length/4);
		long start =System.currentTimeMillis();
		Long sum =pool.invoke(f);
		long end = System.currentTimeMillis();
		System.out.println(sum);
		System.out.println(Foo.count);
		System.out.println(end-start);
		sum = 0L;
		start = System.currentTimeMillis();
		for(int i=0;i<size;i++){
			sum+=data[i];
		}
		end = System.currentTimeMillis();
		System.out.println(sum);
		System.out.println(end-start);
	}
}
class Foo extends RecursiveTask<Long>{
	public static int count = 0;
	private long[] data;
	private int begin;
	private int end;
	private int threshold;
	public Foo(long[] data, int begin, int end, int threshold){
		this.data=data;
		this.begin=begin;
		this.end=end;
		this.threshold=threshold;
		count++;
	}
	public Long compute(){
		if(end - begin<threshold){
			long sum = 0;
			for(int i=begin;i<=end;i++){
				sum+=data[i];
			}
			return sum;
		}else{
			int middle =((end-begin)/2)+begin;
			Foo f1 = new Foo(data, begin, middle, threshold);
			f1.fork();
			Foo f2 = new Foo(data, middle+1, end, threshold);
			return f2.compute()+f1.join();
		}
	}
}
