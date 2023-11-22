package org.example;


/**
 * Bank Requests
 *
 * You've been asked to program a bot for a popular bank that will automate the management of incoming requests. There are three types of requests the bank can receive:
 *  transfer i j sum: request to transfer sum amount of money from the ith account to the jth one;
 *  deposit i sum: request to deposit sum amount of money in the ith account;
 *  withdraw i sum: request to withdraw sum amount of money from the ith account.
 *
 * Your bot should also be able to process invalid requests. There are two types of invalid requests:
 *      invalid account number in the requests;
 *      deposit / withdrawal of a larger amount of money than is currently available.
 *
 * For the given list of accounts and requests, return the state of accounts after all requests have been processed, or an array of a single element [-<request_id>]
 * (please note the minus sign), where <request_id> is the 1-based index of the first invalid request.
 *
 * Example
 *  For accounts = [10, 100, 20, 50, 30] and requests = ["withdraw 2 10", "transfer 5 1 20", "deposit 5 20", "transfer 3 4 15"],
 *  the output should be bankRequests(accounts, requests) = [30, 90, 5, 65, 30].
 *
 *  Here are the states of accounts after each request:
 *      "withdraw 2 10": [10, 90, 20, 50, 30];
 *      "transfer 5 1 20": [30, 90, 20, 50, 10];
 *      "deposit 5 20": [30, 90, 20, 50, 30];
 *      "transfer 3 4 15": [30, 90, 5, 65, 30], which is the answer.
 *
 *  For accounts = [20, 1000, 500, 40, 90] and requests = ["deposit 3 400", "transfer 1 2 30", "withdraw 4 50"],
 *  the output should be bankRequests(accounts, requests) = [-2].
 *
 *  After the first request, accounts becomes equal to [20, 1000, 900, 40, 90], but the second one turns it into [-10, 1030, 900, 40, 90], which is invalid.
 *  Thus, the second request is invalid, and the answer is [-2]. Note that the last request is also invalid, but it shouldn't be included in the answer.
 *
 *  Link: https://app.codesignal.com/skill-test/uwHnJdA8S6LqrjStt
 */

public class Balance {

    int[] process(int accounts[] , String requests[]) {
        int[] finalBalance = accounts;
        int count =0;

     for ( String task : requests) {
         if(task.contains("withdraw")){
             count++;
             //account --> [10,100,20,50,30] task1  "withdraw 2 10"
             String[] values = task.split(" ");
             //values[0] = "withdraw"
             //values[1] = 2 ---> accounts[1]
             //values[2] = 10
             //case 1 check if it is a valid account
             int currentAccountNumber = Integer.parseInt(values[1])-1;
             if(Integer.parseInt(values[1]) <= accounts.length) {
                 finalBalance[currentAccountNumber] = finalBalance[currentAccountNumber]- Integer.parseInt(values[2]);
             }
             else {
                 finalBalance = new int[1];
                 finalBalance[0] = -count;
                 return finalBalance;
             }
         }

         if(task.contains("deposit")){
             //account --> [10,100,20,50,30] task1  "deposit 5 20"
             count++;
             String[] values = task.split(" ");
             //values[0] = "deposit"
             //values[1] = 5 ---> accounts[4]
             //values[2] = 20
             //case 1 check if it is a valid account
             int currentAccountNumber = Integer.parseInt(values[1])-1;
             if(Integer.parseInt(values[1]) <= accounts.length) {
                 finalBalance[currentAccountNumber] = finalBalance[currentAccountNumber]+ Integer.parseInt(values[2]);
             }
             else {
                 finalBalance = new int[1];
                 finalBalance[0] = -count;
                 return finalBalance;
             }

         }

         if(task.contains("transfer")){
             count++;
             //account --> [10,100,20,50,30] task1  "transfer 3 4 15"
             String[] values = task.split(" ");
             //values[0] = transfer
             //values[1] = 3 ---> account[2]
             //values[2] = 4 ----> account[3]
             //values[3] = 15 ---> amount to be transfered
             if(Integer.parseInt(values[1]) <= accounts.length && Integer.parseInt(values[2]) <= accounts.length ) {
                 int amountToTransfer = Integer.parseInt(values[3]);
                 int amountInAccount = finalBalance[(Integer.parseInt(values[1]))-1];
                 if(amountInAccount > amountToTransfer) {
                     finalBalance[Integer.parseInt(values[2]) - 1] += amountToTransfer;
                     finalBalance[Integer.parseInt(values[1]) - 1] -= amountToTransfer;
                 }
                 else{
                     finalBalance = new int[1];
                     finalBalance[0] = -count;
                     return finalBalance;
                 }
             }
             else {
                 finalBalance = new int[1];
                 finalBalance[0] = -count;
                 return finalBalance;
             }
         }
     }
      return finalBalance;
    }


    public static void main(String args[]){
        Balance balance = new Balance();
        int[] accounts = {20, 1000, 900,40,90} ;//[20, 1000, 900, 40, 90];
        //["deposit 3 400", "transfer 1 2 30", "withdraw 4 50"],
        String[] requests = {"deposit 3 400", "transfer 1 2 30", "withdraw 4 50"};
        int[] result = balance.process(accounts, requests);
        for ( int i : result){
            System.out.println(i);
        }


    }
}
