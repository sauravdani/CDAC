library(RMySQL)

mydb = dbConnect(MySQL(), user = 'root', password = "dbda", dbname="acts0925", host="localhost")

dbListTables(mydb)

dbListFields(mydb, 'customer')

rs = dbSendQuery(mydb, "Select * from customer")

data = fetch(rs,n=-1)

dbClearResult(rs)

dbDisconnect(mydb)
