-- # SQL Conditions Clause
-- # https://leetcode.com/problems/trips-and-users/description/

SELECT request_at AS Day, COUNT(*) AS Total_Trips, SUM(
    CASE
        WHEN status IN ("cancelled_by_driver", "cancelled_by_client") THEN 1
        ELSE 0 -- here in else case you can give any value but here we have given 0 so that it wont be calculated ( added extra ) in sum function
    END
) AS Cancled_trips
FROM Trips t1
GROUP BY request_at;
