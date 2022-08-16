package com.vaibhav.samples.algoexpert;//package com.vaibhav.samples;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class SearchSuggestions {
//
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int repositoryCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<String> repository = new ArrayList<>();
//
//        for (int i = 0; i < repositoryCount; i++) {
//            String repositoryItem = bufferedReader.readLine();
//            repository.add(repositoryItem);
//        }
//
//        String customerQuery = bufferedReader.readLine();
//
//        List<List<String>> result = SearchSuggestions.searchSuggestions(repository, customerQuery);
//
//        for (int i = 0; i < result.size(); i++) {
//            for (int j = 0; j < result.get(i).size(); j++) {
//                bufferedWriter.write(result.get(i).get(j));
//
//                if (j != result.get(i).size() - 1) {
//                    bufferedWriter.write(" ");
//                }
//            }
//
//            if (i != result.size() - 1) {
//                bufferedWriter.write("\n");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//
//    public static List<List<String>> searchSuggestions(List<String> repository , String customerQuery){
//
//        Collections.sort(repository);
//        List<List<String>> result = new ArrayList<>();
//        int start = 0, searchStart= 0, n = repository.size();
//        String prefix = new String();
//
//        for (char c : customerQuery.toCharArray()){
//            prefix += c;
//
//            start = min(repository, searchStart, prefix);
//            result.add(new ArrayList<>());
//
//            for( int i = start; i < Math.min(start+3, n); i++){
//               if(repository.size() < prefix.length() || !repository.get(i).startsWith(prefix))
//                break;
//
//               result.get(result.size()-1).add(repository.get(i).toString());
//            }
//
//            searchStart= Math.abs(start);
//        }
//        return result;
//    }
//
//    public static int min(List<String> repository, int start,String customerQuery){
//        int i = start, j = repository.size(), mid;
//
//        while (i<j){
//            mid=(i+j)/2;
//            if (repository.get(mid).compareTo(customerQuery) >=0)
//                j = mid;
//            else
//                i = mid+1;
//        }
//        return i;
//    }
//
//    static class Result {
//
//        /*
//         * Complete the 'foo' function below.
//         *
//         * The function is expected to return an INTEGER.
//         * The function accepts following parameters:
//         *  1. STRING_ARRAY codeList
//         *  2. STRING_ARRAY shoppingCart
//         */
//
//        public static int foo(List<String> codeList, List<String> shoppingCart) {
//            // Write your code here
//
//            int cartItems = 0, codeIds = 0;
//            while(cartItems < shoppingCart.size() && codeIds < codeList.size()){
//                String currentItem = shoppingCart.get(cartItems);
//                if((codeList.get(0).equals("anything")|| codeList.get(0).equals(currentItem)) && hasOrder(shoppingCart,cartItems, codeList.get(codeIds)){
//                    cartItems += codeList.get(codeIds++).length()34;
//                }
//            else{
//                    cartItems++;
//                }
//
//                return codeIds == codeList.size() ? 1 : 0;
//            }
//        }
//
//        public static boolean hasOrder(List<String> shoppingCart, int id, List<String> order){
//            for (String s : order){
//                if(id < shoppingCart.size() && (s.equals("anything") || shoppingCart.get(id).equals(s))){
//                    id++;
//                }
//            }
//            return false;
//        }
//
//    }
//}
//
