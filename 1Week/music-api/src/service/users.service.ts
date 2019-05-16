import { getAllUsers } from "../dao/user.dao";


//this will have all the business logic for getallusers
export async function getAllUsersService(){
    //send email to big boss someone asked for all users
    //write to specific log file about it
    return await getAllUsers()
}