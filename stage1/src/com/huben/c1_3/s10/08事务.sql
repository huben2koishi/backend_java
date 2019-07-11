START TRANSACTION ;
UPDATE account
SET balance=balance - 500
WHERE id = 1;
UPDATE account
SET balance=balance + 500
WHERE id = 2;

ROLLBACK;

COMMIT;

SELECT @@transaction_isolation;

SET GLOBAL TRANSACTION ISOLATION LEVEL SERIALIZABLE;