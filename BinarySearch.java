class BinarySearch {
    // binary search returns index of name if it is present in sArray[], else it return -2
    int binarySearch(String sArray[], int lengthModifier, int arraylen, String name)
    {
        if (arraylen >= lengthModifier) {
            int middleofarray = lengthModifier + (arraylen - lengthModifier) / 2;

            // If the element is present in the middle index, return the middle index
            if (sArray[middleofarray].equals(name))
                return middleofarray;

            // Else if the element is smaller than middle array index, then it can only be inside left subarray
            else if (sArray[middleofarray].compareTo(name) > 0)
                return binarySearch(sArray, lengthModifier, middleofarray - 1, name);

            // Else the array element can only be inside of the right subarray
            else
            return binarySearch(sArray, middleofarray + 1, arraylen, name);
        }

        else
        // Return -2 when name is not inside of array
        return -2;
    }


    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        String sArray[] = { "Abby", "Boe", "Dave", "Eary", "Frank", "Garah", "Kim", "Laleb", "Roey", "Zike" };
        int arrayLength = sArray.length;
        String name = "Zike";
        int result = ob.binarySearch(sArray, 0, arrayLength - 1, name);
        if (result == -2)
            System.out.println("Element " + name + " is not present in the array");
        else
            System.out.println("Element " + name + " can be found at array index " + result);
    }
}
