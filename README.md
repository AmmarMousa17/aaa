# aaa
## Phase2- first 

producer puts tasks in blocking queue by main thread
all threads in thread pool listens blocking queue and consume that tasks one thread for each task

### Supplier

### Controller
#### applyTask: 
takes consumer of the whole blocking queue
 after supplier puts all elements in blocking queue 
it consumes the blocking queue 

### Consumers
#### run tasks
makes thread for each task
#### consumeTasks
retutn consumer of blocking queue 


## Phase2- second 
producer puts tasks in blocking queue 
all threads in thread pool listens blocking queue and consume that tasks one thread for each task
##### applyTasks takes consumer of task not a whole blocking queue

## Phase3
Demo of consumetasks with observables and with completablefuture 
