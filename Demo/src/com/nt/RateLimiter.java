package com.nt;



import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class RateLimiter {

	private int duration;
	private int transactionLimit;
	private int tokens;

	public RateLimiter(int duration, int transLimt) {
		this.duration = duration;
		this.transactionLimit = transLimt;
		this.tokens = this.transactionLimit;
	}

	public void resetTokens() {
		tokens = this.transactionLimit;
	}

	public void runScheduler() {
		ScheduledExecutorService es = Executors.newSingleThreadScheduledExecutor();
		es.scheduleAtFixedRate(new Scheduler(this), 0, 10, TimeUnit.SECONDS);
	}
	/**
	 * Return true if token issues, false otherwise.
	 * @return
	 */
	public boolean issueToken() {
		if (tokens > 0) {
			tokens--;
		} else {
			return false;
		}
		return true;
	}

	private class Scheduler implements Runnable {
		RateLimiter rl;
		public Scheduler(RateLimiter rl) {
			this.rl = rl;
		}
		@Override
		public void run() {
			rl.resetTokens();
		}
	}

	public static void main(String[] args) {
		RateLimiter rl = new RateLimiter(10, 5);
		rl.runScheduler();
		for(int i = 0; i < 100; i++) {
			if(rl.issueToken()) {
				System.out.println("Transaction number :" + i + " passed");
			} else {
				System.out.println("Transaction number :" + i + " failed");
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}