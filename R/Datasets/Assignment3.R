setwd('C:/Users/dbda.STUDENTSDC/Documents/GitHub/CDAC/R/Datasets/')
survey = read.csv("survey.csv")

library(tidyverse)

#Ques1.1
MaleNoSmokers <- filter(survey, survey$Smoke == "Never")

#Ques1.2
PulseGT80 <- filter(survey, survey$Pulse > 80) %>% select(Sex,Exer,Smoke,Pulse) %>% arrange(Pulse)

#Ques1.3
RtHand <- survey %>% mutate(Ratio_Hnd = Wr.Hnd/NW.Hnd) %>% select(Ratio_Hnd, Clap, Age)

#Ques1.4
DescStats <- survey %>% summarise(mean(Age),sd(Age))

#Ques1.5
DescGrp <- survey %>%  group_by(Sex) %>% summarise(mean(Age), sd(Age))


#Ques2
items <- read.csv("Items.csv")
orders <- read.csv("Orders.csv")
ordDet <- read.csv("Ord_Details.csv")

itemsOrder = inner_join(items, ordDet, by = "Item.ID")
finalJoin = inner_join(itemsOrder, orders, by = "Order.ID")

#Ques3
courses <- read.csv("Courses.csv")
cschedule <- read.csv("CourseSchedule.csv")
#cschedule <- rename(cschedule, CourseID = CourseCode)

courseJoin <-  rename(cschedule, CourseID = CourseCode) %>% inner_join(courses, by='CourseID')

#Ques4
comb <- read.csv('comb1.csv')
ans <- gather(comb, Highlighter, Marker, Pen, Refill, key="ItemType", value="Qty")


#Ques5
comb2 <- read.csv('comb2.csv')
ans <- comb2 %>% 
  separate(PatientID,into = c('projectID', 'siteID','patientNumber'),convert = T)


#QUES6
data(survey)
stas <- survey %>% 
  group_by(Smoke,Exer) %>% 
  summarise(mu_ht=mean(Hight,na.rm=T)) %>% 
  drop_na()






