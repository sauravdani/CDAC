library(tidyverse)
table4a
gather(table4a,'1999','2000',
       key="year", value='cases')

pivot_longer(table4a, c('1999', '2000'),
             names_to = "Year",
             values_to = "cases")
############## spreading ######
table2 %>% spread(key="type", value = "count")

table2 %>% pivot_wider(names_from = 'type', values_from = 'count')


table3
table3 %>% 
  separate(rate, into = c("cases", "poop"), convert = T)

table5
unite(table5, yyyy, century, year, sep="")
