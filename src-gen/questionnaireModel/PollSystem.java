/**
 */
package questionnaireModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Poll System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link questionnaireModel.PollSystem#getPolls <em>Polls</em>}</li>
 * </ul>
 *
 * @see questionnaireModel.QuestionnaireModelPackage#getPollSystem()
 * @model
 * @generated
 */
public interface PollSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Polls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polls</em>' containment reference.
	 * @see #setPolls(Poll)
	 * @see questionnaireModel.QuestionnaireModelPackage#getPollSystem_Polls()
	 * @model containment="true"
	 * @generated
	 */
	Poll getPolls();

	/**
	 * Sets the value of the '{@link questionnaireModel.PollSystem#getPolls <em>Polls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polls</em>' containment reference.
	 * @see #getPolls()
	 * @generated
	 */
	void setPolls(Poll value);

} // PollSystem
