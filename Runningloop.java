package com.examples;


public class Runningloop {

	public static void main(String[] args) {
		final long NANOSEC_PER_SEC = 1000*1000*1000;
        long startTime = System.nanoTime();
		long CHECKTESTCONNECTION_RESPONSELOOPTIME =Long.parseLong("60");
		int i=0;
		String checkstatus=null;
	    while ((checkstatus==null || "N".equals(checkstatus))&&((System.nanoTime()-startTime)< CHECKTESTCONNECTION_RESPONSELOOPTIME*NANOSEC_PER_SEC)){
			LOGGER.info("::::: "+i);
		  try {
			Thread.sleep(10000);
			LOGGER.info("Thread ----------- ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  i=i+1;
		}
		LOGGER.info("*******************************************************");
	}
}
