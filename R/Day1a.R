housing <- read.csv("C:/Users/dbda.STUDENTSDC/Documents/GitHub/CDAC/R/Datasets/Housing.csv")
str(housing) #gives internal strcute of object

housing <- read.csv("C:/Users/dbda.STUDENTSDC/Documents/GitHub/CDAC/R/Datasets/Housing.csv",stringsAsFactors = T)
str(housing) #gives internal strcute of object                                             StringsAsFactor conver strings in factors

boly <- read.csv("C:/Users/dbda.STUDENTSDC/Documents/GitHub/CDAC/R/Datasets/Bollywood_2015.csv")
boly

boly2 <- read.csv("C:/Users/dbda.STUDENTSDC/Documents/GitHub/CDAC/R/Datasets/Bollywood_2015_2.csv",header = F)
colnames(boly2) <- c("Name", "Collections", "Bodget", "Verdict")
boly2
max(boly2$Bodget)

diamonds <- read.csv2("C:/Users/dbda.STUDENTSDC/Documents/GitHub/CDAC/R/Datasets/Diamonds.csv")
diamonds   #This is used for redaing data which is semi colon separated

library(readxl)
sale <- read_excel("C:/Users/dbda.STUDENTSDC/Documents/GitHub/CDAC/R/Datasets/Sales.xlsx")


write.csv(sale, "C:/Users/dbda.STUDENTSDC/Documents/GitHub/CDAC/R/Datasets/Sales.csv")

x <- c(12,3,4,6,23,5,67,9,65,4,67,54,8,65,3,576,4)
x[1:5]

x>50
x[x>50]

m <- matrix(c(1:12),4,3)
m

m[3,3]
m[2,]
m[,3]
m[,3,drop=F]

#############Subset in dataframes###########################
housing[,1:5] #gives 1st to 5th coloum
housing[,-c(4,6)] #removing 4 and 6 and giving remaing

housing[c(3,4,5,8,450,1),]#only return specific rows

ss <- subset(housing, bathrms > 2) #retuns data based on conditions
ss

ss <- subset(housing, bathrms > 2 & driveway=="yes") 
ss
write.csv(ss,"C:/Users/dbda.STUDENTSDC/Documents/GitHub/CDAC/R/Datasets/ss.csv")


ss_hou <- subset(housing,select = c(price,bedrooms,recroom))
ss_hou
