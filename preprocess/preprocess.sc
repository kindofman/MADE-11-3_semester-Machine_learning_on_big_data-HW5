import breeze.linalg._
import java.io._


val X_train = DenseMatrix((1.0,2.0),
                          (4.0,5.0),
                          (7.0,8.0))

val y = DenseMatrix(3.0, 9.0, 15.0)

val X_test = DenseMatrix((9.0, 10.0),
                         (11.0, 12.0),
                         (13.0, 14.0))


val W: DenseMatrix[Double] = pinv(X_train) * y

val yPredicted = X_test * W
