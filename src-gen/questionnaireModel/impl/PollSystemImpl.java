/**
 */
package questionnaireModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import questionnaireModel.Poll;
import questionnaireModel.PollSystem;
import questionnaireModel.QuestionnaireModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Poll System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link questionnaireModel.impl.PollSystemImpl#getPolls <em>Polls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PollSystemImpl extends MinimalEObjectImpl.Container implements PollSystem {
	/**
	 * The cached value of the '{@link #getPolls() <em>Polls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolls()
	 * @generated
	 * @ordered
	 */
	protected Poll polls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PollSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionnaireModelPackage.Literals.POLL_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Poll getPolls() {
		return polls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolls(Poll newPolls, NotificationChain msgs) {
		Poll oldPolls = polls;
		polls = newPolls;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					QuestionnaireModelPackage.POLL_SYSTEM__POLLS, oldPolls, newPolls);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolls(Poll newPolls) {
		if (newPolls != polls) {
			NotificationChain msgs = null;
			if (polls != null)
				msgs = ((InternalEObject) polls).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - QuestionnaireModelPackage.POLL_SYSTEM__POLLS, null, msgs);
			if (newPolls != null)
				msgs = ((InternalEObject) newPolls).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - QuestionnaireModelPackage.POLL_SYSTEM__POLLS, null, msgs);
			msgs = basicSetPolls(newPolls, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnaireModelPackage.POLL_SYSTEM__POLLS,
					newPolls, newPolls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QuestionnaireModelPackage.POLL_SYSTEM__POLLS:
			return basicSetPolls(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QuestionnaireModelPackage.POLL_SYSTEM__POLLS:
			return getPolls();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case QuestionnaireModelPackage.POLL_SYSTEM__POLLS:
			setPolls((Poll) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case QuestionnaireModelPackage.POLL_SYSTEM__POLLS:
			setPolls((Poll) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case QuestionnaireModelPackage.POLL_SYSTEM__POLLS:
			return polls != null;
		}
		return super.eIsSet(featureID);
	}

} //PollSystemImpl
