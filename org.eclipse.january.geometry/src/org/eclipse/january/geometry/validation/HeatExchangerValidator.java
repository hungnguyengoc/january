/*******************************************************************************
 * Copyright (c) 2016 UT-Battelle, LLC. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     UT-Battelle, LLC. - initial API and implementation
 *******************************************************************************/
/**
 *
 * $Id$
 */
package org.eclipse.january.geometry.validation;

import org.eclipse.january.geometry.Junction;
import org.eclipse.january.geometry.Pipe;

/**
 * A sample validator interface for {@link org.eclipse.january.geometry.HeatExchanger}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface HeatExchangerValidator {
	boolean validate();

	boolean validatePipe(Pipe value);
	boolean validateInput(Junction value);
	boolean validateOutput(Junction value);
}
