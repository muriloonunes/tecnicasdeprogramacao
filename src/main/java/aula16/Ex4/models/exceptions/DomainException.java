/*
 * Copyright (C) 2024. Murilo Nunes <murilo_no@outlook.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package aula16.Ex4.models.exceptions;

import java.io.Serial;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 04/10/2024
 * @brief Class DomainException
 */
public class DomainException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public DomainException(String s) {
        super(s);
    }
}
