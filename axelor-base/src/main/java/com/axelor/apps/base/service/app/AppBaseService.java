/**
 * Axelor Business Solutions
 *
 * Copyright (C) 2016 Axelor (<http://axelor.com>).
 *
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.axelor.apps.base.service.app;

import java.math.BigDecimal;
import java.util.List;

import java.time.ZonedDateTime;
import java.time.LocalDate;

import com.axelor.apps.base.db.AppBase;
import com.axelor.apps.base.db.CurrencyConversionLine;
import com.axelor.apps.base.db.Unit;
import com.axelor.db.Model;

public interface AppBaseService extends AppService {

	public AppBase getAppBase();

// Date du jour

	/**
	 * Récupérer la date du jour avec l'heure.
	 * Retourne la date du jour paramétré dans l'utilisateur si existe,
	 * sinon récupère celle de l'administration générale,
	 * sinon date du jour.
	 * private
	 * @return
	 */
	public ZonedDateTime getTodayDateTime();

	/**
	 * Récupérer la date du jour.
	 * Retourne la date du jour paramétré dans l'utilisateur si existe,
	 * sinon récupère celle de l'administration générale,
	 * sinon date du jour.
	 *
	 * @return
	 */
	public LocalDate getTodayDate();

	public Unit getUnit();


	public int getNbDecimalDigitForUnitPrice();


// Conversion de devise

	/**
	 * Obtenir la tva à 0%
	 *
	 * @return
	 */
	public List<CurrencyConversionLine> getCurrencyConfigurationLineList();

	public Class<? extends Model> getPersistentClass(Model model);

	public BigDecimal getDurationHours(BigDecimal duration);

	public BigDecimal getGeneralDuration(BigDecimal duration);

}
