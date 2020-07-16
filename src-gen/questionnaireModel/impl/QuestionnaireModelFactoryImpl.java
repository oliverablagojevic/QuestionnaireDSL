/**
 */
package questionnaireModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import questionnaireModel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestionnaireModelFactoryImpl extends EFactoryImpl implements QuestionnaireModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QuestionnaireModelFactory init() {
		try {
			QuestionnaireModelFactory theQuestionnaireModelFactory = (QuestionnaireModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(QuestionnaireModelPackage.eNS_URI);
			if (theQuestionnaireModelFactory != null) {
				return theQuestionnaireModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QuestionnaireModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case QuestionnaireModelPackage.POLL_SYSTEM:
			return createPollSystem();
		case QuestionnaireModelPackage.POLL:
			return createPoll();
		case QuestionnaireModelPackage.QUESTION:
			return createQuestion();
		case QuestionnaireModelPackage.OPTION:
			return createOption();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PollSystem createPollSystem() {
		PollSystemImpl pollSystem = new PollSystemImpl();
		return pollSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Poll createPoll() {
		PollImpl poll = new PollImpl();
		return poll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Question createQuestion() {
		QuestionImpl question = new QuestionImpl();
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Option createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionnaireModelPackage getQuestionnaireModelPackage() {
		return (QuestionnaireModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QuestionnaireModelPackage getPackage() {
		return QuestionnaireModelPackage.eINSTANCE;
	}

} //QuestionnaireModelFactoryImpl
