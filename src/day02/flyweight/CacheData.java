package day02.flyweight;

import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class CacheData {
	private Object obj;
	private ReentrantReadWriteLock rrwl = new ReentrantReadWriteLock();
	private HashMap hm = new HashMap();
	public Object getKey(Object key){
		rrwl.readLock().lock();
	    try{
	    	obj = hm.get(key);
	    	if(obj==null){
	    		rrwl.readLock().unlock();
	    		rrwl.writeLock().lock();
	    		try{
	    			if(obj==null){
	    			   obj = "....";//创建对象的工作 or 从后台获取数据
	    			   hm.put(key, obj);
	    			}
	    		}finally{
	    			rrwl.writeLock().unlock();
	    			rrwl.readLock().lock();
	    		}
	    	}
	    }finally{
	    	rrwl.readLock().unlock();
	    }
		return obj;
	}
}

	