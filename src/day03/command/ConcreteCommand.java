package day03.command;
class ConcreteCommand extends Command {  
private Receiver receiver; //ά��һ������������߶��������  
 
	    public void execute() {  
	        receiver.action(); //������������ߵ�ҵ������action()  
    }  
}  
