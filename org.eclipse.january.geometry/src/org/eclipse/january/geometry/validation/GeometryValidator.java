/**
 *
 * $Id$
 */
package org.eclipse.january.geometry.validation;

import org.eclipse.january.geometry.VertexSource;


/**
 * A sample validator interface for {@link org.eclipse.january.geometry.Geometry}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GeometryValidator {
	boolean validate();

	boolean validateVertexSource(VertexSource value);

}
