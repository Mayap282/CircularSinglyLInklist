package edu.learn.circularLinkList;

public class linkList {

	protected Node start;
	protected Node end;
	public int size;
	
	public linkList(){
		start=null;
		end=null;
		size=0;
	}
	
	public boolean isEmpty(){
		return start==null;
		
	}
	
	public int getSize(){
		return size;
	}
	//
	public void insertAtStart(int val){
		Node nptr = new Node(null,val);
		nptr.setLink(start);
		if(start==null){
			start=nptr;
			nptr.setLink(start);
			end=start;
		}
		else{
			end.setLink(nptr);
			start=nptr;
		}
		size++;
	}
	//
	public void insertAtEnd(int val){
		Node nptr = new Node(null,val);
		nptr.setLink(start);
		if(start==null){
			start=nptr;
			nptr.setLink(start);
			end=start;
		}
		else{
			end.setLink(nptr);
			end=nptr;
		}
		size++;
	}
	//
	public void insertAtpos(int val,int pos){
		Node nptr = new Node(null,val);
		Node ptr = start;
		pos=pos-1;
		for(int i = 0;i<size-1;i++){
			if(i==pos){
				Node temp = ptr.getLink();
				ptr.setLink(nptr);
				nptr.setLink(temp);
				break;
				
			}
			ptr = ptr.getLink();
		}
		size++;
	}
	//
	public void Display(){
		System.out.print("\n Circular Singly Link List = \n");
		
		Node ptr = start;
		if(size==0){
			System.out.print("empty\n");
		}
		if(start.getLink()==start){
			System.out.print(start.getData()+" ->"+ptr.getData()+" \n");
			return;
		}
		System.out.println(start.getData()+"->");
		ptr = start.getLink();
		while(ptr.getLink()!=start){
			System.out.print(ptr.getData()+"->");
			ptr=ptr.getLink();
			
		}
		System.out.print(ptr.getData()+"->");
		ptr= ptr.getLink();
		//System.out.println(ptr.getData()+"\n");
	}
}
