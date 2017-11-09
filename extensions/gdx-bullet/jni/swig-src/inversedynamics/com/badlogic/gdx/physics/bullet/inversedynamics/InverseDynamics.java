/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.inversedynamics;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.physics.bullet.dynamics.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class InverseDynamics {

	/** Temporary Vector3 instance, used by native methods that return a Vector3 instance */
	public final static Vector3 staticVector3 = new Vector3();
	/** Pool of Vector3, used by native (callback) method for the arguments */
	public final static com.badlogic.gdx.utils.Pool<Vector3> poolVector3 = new com.badlogic.gdx.utils.Pool<Vector3>() {
		@Override
		protected Vector3 newObject() {
			return new Vector3();
		}
	};


	/** Temporary Quaternion instance, used by native methods that return a Quaternion instance */
	public final static Quaternion staticQuaternion = new Quaternion();
	/** Pool of Quaternion, used by native (callback) method for the arguments */
	public final static com.badlogic.gdx.utils.Pool<Quaternion> poolQuaternion = new com.badlogic.gdx.utils.Pool<Quaternion>() {
		@Override
		protected Quaternion newObject() {
			return new Quaternion();
		}
	};


	/** Temporary Matrix3 instance, used by native methods that return a Matrix3 instance */
	public final static Matrix3 staticMatrix3 = new Matrix3();
	/** Pool of Matrix3, used by native (callback) method for the arguments */
	public final static com.badlogic.gdx.utils.Pool<Matrix3> poolMatrix3 = new com.badlogic.gdx.utils.Pool<Matrix3>() {
		@Override
		protected Matrix3 newObject() {
			return new Matrix3();
		}
	};


	/** Temporary Matrix4 instance, used by native methods that return a Matrix4 instance */
	public final static Matrix4 staticMatrix4 = new Matrix4();
	/** Pool of Matrix4, used by native (callback) method for the arguments */
	public final static com.badlogic.gdx.utils.Pool<Matrix4> poolMatrix4 = new com.badlogic.gdx.utils.Pool<Matrix4>() {
		@Override
		protected Matrix4 newObject() {
			return new Matrix4();
		}
	};

  public static void setZero(SWIGTYPE_p_vec3 v) {
    InverseDynamicsJNI.setZero__SWIG_0(SWIGTYPE_p_vec3.getCPtr(v));
  }

  public static void setZero(SWIGTYPE_p_vecx v) {
    InverseDynamicsJNI.setZero__SWIG_1(SWIGTYPE_p_vecx.getCPtr(v));
  }

  public static void setZero(SWIGTYPE_p_mat33 m) {
    InverseDynamicsJNI.setZero__SWIG_2(SWIGTYPE_p_mat33.getCPtr(m));
  }

  public static float maxAbs(SWIGTYPE_p_vecx v) {
    return InverseDynamicsJNI.maxAbs__SWIG_0(SWIGTYPE_p_vecx.getCPtr(v));
  }

  public static float maxAbs(SWIGTYPE_p_vec3 v) {
    return InverseDynamicsJNI.maxAbs__SWIG_1(SWIGTYPE_p_vec3.getCPtr(v));
  }

  public static void getVecMatFromDH(float theta, float d, float a, float alpha, SWIGTYPE_p_vec3 r, SWIGTYPE_p_mat33 T) {
    InverseDynamicsJNI.getVecMatFromDH(theta, d, a, alpha, SWIGTYPE_p_vec3.getCPtr(r), SWIGTYPE_p_mat33.getCPtr(T));
  }

  public static boolean isPositiveDefinite(SWIGTYPE_p_mat33 m) {
    return InverseDynamicsJNI.isPositiveDefinite(SWIGTYPE_p_mat33.getCPtr(m));
  }

  public static boolean isPositiveSemiDefinite(SWIGTYPE_p_mat33 m) {
    return InverseDynamicsJNI.isPositiveSemiDefinite(SWIGTYPE_p_mat33.getCPtr(m));
  }

  public static boolean isPositiveSemiDefiniteFuzzy(SWIGTYPE_p_mat33 m) {
    return InverseDynamicsJNI.isPositiveSemiDefiniteFuzzy(SWIGTYPE_p_mat33.getCPtr(m));
  }

  public static float determinant(SWIGTYPE_p_mat33 m) {
    return InverseDynamicsJNI.determinant(SWIGTYPE_p_mat33.getCPtr(m));
  }

  public static boolean isValidInertiaMatrix(SWIGTYPE_p_mat33 I, int index, boolean has_fixed_joint) {
    return InverseDynamicsJNI.isValidInertiaMatrix(SWIGTYPE_p_mat33.getCPtr(I), index, has_fixed_joint);
  }

  public static boolean isValidTransformMatrix(SWIGTYPE_p_mat33 m) {
    return InverseDynamicsJNI.isValidTransformMatrix(SWIGTYPE_p_mat33.getCPtr(m));
  }

  public static void bodyTParentFromAxisAngle(SWIGTYPE_p_vec3 axis, float angle, SWIGTYPE_p_mat33 T) {
    InverseDynamicsJNI.bodyTParentFromAxisAngle(SWIGTYPE_p_vec3.getCPtr(axis), angle, SWIGTYPE_p_mat33.getCPtr(T));
  }

  public static boolean isUnitVector(SWIGTYPE_p_vec3 vector) {
    return InverseDynamicsJNI.isUnitVector(SWIGTYPE_p_vec3.getCPtr(vector));
  }

  public static SWIGTYPE_p_mat33 tildeOperator(SWIGTYPE_p_vec3 v) {
    return new SWIGTYPE_p_mat33(InverseDynamicsJNI.tildeOperator(SWIGTYPE_p_vec3.getCPtr(v)), true);
  }

  public static SWIGTYPE_p_mat33 transformX(float alpha) {
    return new SWIGTYPE_p_mat33(InverseDynamicsJNI.transformX(alpha), true);
  }

  public static SWIGTYPE_p_mat33 transformY(float beta) {
    return new SWIGTYPE_p_mat33(InverseDynamicsJNI.transformY(beta), true);
  }

  public static SWIGTYPE_p_mat33 transformZ(float gamma) {
    return new SWIGTYPE_p_mat33(InverseDynamicsJNI.transformZ(gamma), true);
  }

  public static SWIGTYPE_p_vec3 rpyFromMatrix(SWIGTYPE_p_mat33 rot) {
    return new SWIGTYPE_p_vec3(InverseDynamicsJNI.rpyFromMatrix(SWIGTYPE_p_mat33.getCPtr(rot)), true);
  }

}