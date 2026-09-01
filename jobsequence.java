package DSA;

public class jobsequence {
    public static void fingjobsequence(job[] jobs){
        int n= jobs.length;

        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);
        int maxDeadline=0;
        for (job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);

            char[] result = new char[maxDeadline];
            boolean[] slotfilled = new boolean[maxDeadline];

            int totalprofit=0;

            for (job job : jobs) {
                for (int j = Math.min(maxDeadline - 1, job.deadline - 1); j >= 0; j--) {
                    if (!slotfilled[j]) {
                        result[j] = job.id;
                        slotfilled[j] = true;
                        totalprofit += job.profit;
                        break;
                    }
                }
            }
    }
    
    
    
}
