import { User } from "../models/user";
import { UserDTO } from "../dtos/user.dto";

export function sqlUsertojsUSer(sqluser:UserDTO):User{
    return new User(sqluser.username, sqluser.user_pass, null, sqluser.user_id, sqluser.roles.split(','))
}