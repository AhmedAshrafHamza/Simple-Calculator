package com.simplemobiletools.calculator.operation
import com.simplemobiletools.calculator.operation.base.Operation
import com.simplemobiletools.calculator.operation.base.UnaryOperation
/**
 * Created by Ahmed Ashraf Hamza with Ahmad Osama on 2018-12-18.
 */
class TanOperation(value: Double) : UnaryOperation(value), Operation {
    override fun getResult() = Math.tan(Math.toRadians(value))
}