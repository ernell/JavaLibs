/*
 * Copyright (C) 2012 Robert Andersson <http://www.ernell.se>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package se.ernell.utils;

public class Timer {
  private long start;
  private long end;
  private long total;

  public ExecutionTimer() {
	  reset();
	  resetTotal();
  }

  public void start() {
    start = System.currentTimeMillis();
  }

  public void end() {
    end = System.currentTimeMillis();
    total += (end-start);
  }

  public void stop() {
	    end = System.currentTimeMillis();
	    total += (end-start);
	  }

  public long duration(){
    return (end-start);
  }

  public long durationPerItem(long counter){
	  if(counter <= 0)
		  return (end-start);
	  return (end-start)/counter;
  }

  public long durationSeconds(){
	    return (end-start)/1000;
  }

  public long durationTotal(){
	    return total;
  }

  public long durationTotalPerItem(long counter){
	  if(counter <= 0)
		  return total;
	  return (total/counter);
  }

  public long durationItemsPerSecond(int counter){
	  if(counter <= 0)
		  return -1;
	  return ((counter/total)*1000);
  }

  public long durationTotalSeconds(){
	    return (total/1000);
  }

  public String getDurationSecondsDecimal(){
	  long seconds = (end-start) / 1000;
	  long millis  = (end-start)-(seconds*1000);
	  return String.valueOf(seconds)+"."+String.valueOf(millis);
  }
  
  public void reset() {
	  start = 0;  
	  end   = 0;
  }

  public void resetTotal() {
	    total = 0;
  }

  public void resetAll() {
	  start = 0;  
	  end   = 0;
	  total = 0;
  }

}
