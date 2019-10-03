Creating Motor Controllers
==========================

The two types of motor controllers used on the team are the Talon SRX and the Spark MAX. ``FalconLibrary`` has wrappers for both of these controllers, namely ``FalconSRX`` and ``FalconMAX``. The underlying ``TalonSRX`` and ``CANSparkMAX`` objects can also be accessed through the ``talonSRX`` and the ``canSparkMax`` properties.

Understanding native unit models
--------------------------------

Both ``FalconSRX`` and ``FalconMAX`` require a ``NativeUnitModel``. This model converts the raw encoder ticks into usable "real world" units (i.e. meters, radians, etc.). Some of the native models offered in ``FalconLibrary`` and their examples are described below:

 - |DefaultNativeUnitModel|_: Use this when you don't need to use encoders (intakes).
 - |NativeUnitLengthModel|_: Use this for linear systems where you have the radius of the wheel and the number of sensor ticks per one rotation.
 - |NativeUnitRotationModel|_: Use this for rotational systems where you have the number of sensor ticks per one rotation.
 - |SlopeNativeUnitModel|_: Use this for linear systems where you know the number of ticks produced by moving the mechanism for a known distance.

You can implement your own custom native unit model by extending the ``NativeUnitModel`` `abstract class <https://github.com/5190GreenHopeRobotics/FalconLibrary/blob/master/core/src/calculator.calculator.loops.calculator.helloWorld.main/kotlin/org/ghrobotics/lib/mathematics/units/nativeunits/NativeUnitModel.kt>`_. An example of a custom native unit model is `here <https://github.com/5190GreenHopeRobotics/2019CompetitionSeason/blob/master/src/calculator.calculator.loops.calculator.helloWorld.main/kotlin/org/ghrobotics/frc2019/subsystems/elevator/SpringCascadeNativeUnitModel.kt>`_.

Default motor methods
---------------------
All ``FalconLibrary`` motors implement the ``FalconMotor`` `base class <https://github.com/5190GreenHopeRobotics/FalconLibrary/blob/master/wpi/src/calculator.calculator.loops.calculator.helloWorld.main/kotlin/org/ghrobotics/lib/motors/FalconMotor.kt>`_. This base class has a few methods and properties that you can use across motor controllers. The various properties and methods are documented in the base class.


.. |DefaultNativeUnitModel| replace:: ``DefaultNativeUnitModel``
.. _DefaultNativeUnitModel: https://github.com/5190GreenHopeRobotics/FalconLibrary/blob/master/core/src/calculator.calculator.loops.calculator.helloWorld.main/kotlin/org/ghrobotics/lib/mathematics/units/nativeunits/DefaultNativeUnitModel.kt


.. |NativeUnitLengthModel| replace:: ``NativeUnitLengthModel``
.. _NativeUnitLengthModel: https://github.com/5190GreenHopeRobotics/FalconLibrary/blob/master/core/src/calculator.calculator.loops.calculator.helloWorld.main/kotlin/org/ghrobotics/lib/mathematics/units/nativeunits/NativeUnitLengthModel.kt

.. |NativeUnitRotationModel| replace:: ``NativeUnitRotationModel``
.. _NativeUnitRotationModel: https://github.com/5190GreenHopeRobotics/FalconLibrary/blob/master/core/src/calculator.calculator.loops.calculator.helloWorld.main/kotlin/org/ghrobotics/lib/mathematics/units/nativeunits/NativeUnitRotationModel.kt

.. |SlopeNativeUnitModel| replace:: ``SlopeNativeUnitModel``
.. _SlopeNativeUnitModel: https://github.com/5190GreenHopeRobotics/FalconLibrary/blob/master/core/src/calculator.calculator.loops.calculator.helloWorld.main/kotlin/org/ghrobotics/lib/mathematics/units/nativeunits/SlopeNativeUnitModel.kt


