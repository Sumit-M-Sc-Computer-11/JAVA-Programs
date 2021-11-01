#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<string.h>


void ls_file()
{
    printf("Inside ls command\n");
}

int main()
{
    char str[80];
    char command[4][80];
    int count = 0;
    
    while(1)
    {
        fflush(stdin);
        strcpy(str,"");
        
        printf("\nMarvellous VFS>");
        scanf("%[^'\n']s",str);
        
        count = sscanf(str,"%s %s %s %s",command[0],command[1],command[2],command[3]);
        
        if(count == 1)
        {
            if(strcmp(command[0],"ls") == 0)
            {
                ls_file();
            }
            else if(strcmp(command[0],"exit") == 0)
            {
                printf("Thank you for using Marvellous VFS\n");
                break;
            }
        }
        else if (count ==2)
        {}
        else if(count == 3)
        {}
        else if(count ==4)
        {
        }
        else
        {
            printf("Command not found\n");
        }
    }
    return 0;
}
