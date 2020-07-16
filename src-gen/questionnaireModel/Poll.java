/**
 */
package questionnaireModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Poll</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link questionnaireModel.Poll#getName <em>Name</em>}</li>
 *   <li>{@link questionnaireModel.Poll#getQuestions <em>Questions</em>}</li>
 * </ul>
 *
 * @see questionnaireModel.QuestionnaireModelPackage#getPoll()
 * @model
 * @generated
 */
public interface Poll extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see questionnaireModel.QuestionnaireModelPackage#getPoll_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link questionnaireModel.Poll#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Questions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questions</em>' containment reference.
	 * @see #setQuestions(Question)
	 * @see questionnaireModel.QuestionnaireModelPackage#getPoll_Questions()
	 * @model containment="true"
	 * @generated
	 */
	Question getQuestions();

	/**
	 * Sets the value of the '{@link questionnaireModel.Poll#getQuestions <em>Questions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Questions</em>' containment reference.
	 * @see #getQuestions()
	 * @generated
	 */
	void setQuestions(Question value);

} // Poll
