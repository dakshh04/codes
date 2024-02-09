class Tree 
{
    //Function to serialize a tree and return a list containing nodes of tree.
    static final int EMPTY = -1;
	public void serialize(Node root, ArrayList<Integer> arr) 
	{
	    //code here
	    if(root == null){
	        arr.add(EMPTY);
	        return;
	    }
	    
	    arr.add(root.data);
	    serialize(root.left, arr);
	    serialize(root.right, arr);
	}
	
	//Function to deserialize a list and construct the tree.
	int index = 0;
    public Node deSerialize(ArrayList<Integer> arr)
    {
        //code here
        if(index == arr.size()){
            return null;
        }
        
        int val = arr.get(index);
        index++;
        
        if(val == EMPTY) return null;
        
        Node root = new Node(val);
        root.left = deSerialize(arr);
        root.right = deSerialize(arr);
        return root;
        
    }
};