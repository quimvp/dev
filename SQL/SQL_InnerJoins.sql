--  # https://leetcode.com/problems/trips-and-users/submissions/1300317300/


SELECT request_at AS Day, ROUND(SUM(
    CASE
        WHEN status IN ("cancelled_by_driver", "cancelled_by_client") THEN 1
        ELSE 0
    END
)/COUNT(*),2) AS 'Cancellation Rate'
FROM Trips t
INNER JOIN Users c ON c.users_id = t.client_id
INNER JOIN Users d ON d.users_id = t.driver_id
WHERE '2013-10-01' <= t.request_at AND t.request_at <= '2013-10-03'
AND d.banned = 'No'
AND c.banned = 'No'
GROUP BY request_at;
