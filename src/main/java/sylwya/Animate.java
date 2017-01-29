/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sylwya;

/**
 *
 * @author judicael
 */
public class Animate implements Runnable{
    
    BlockBreakerPanel bp;
	
	Animate (BlockBreakerPanel b){
		bp =b;
	}

    @Override
    public void run() {
        while(true){
			bp.update();
			try {
				try {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    }
    
}
