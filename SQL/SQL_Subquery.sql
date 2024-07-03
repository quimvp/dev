-- # SQL SubQuerry

-- # https://leetcode.com/problems/trips-and-users/

SELECT request_at AS Day, COUNT(*) AS Total_Trips, (
    SELECT COUNT(*)
    FROM Trips t2
    WHERE status IN ("cancelled_by_driver","cancelled_by_client")
    AND t1.request_at = t2.request_at -- this is used to match the canceled req by date
) AS Cancled_trips
FROM Trips t1
GROUP BY request_at;
