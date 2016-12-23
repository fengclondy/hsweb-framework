/*
 *
 *  * Copyright 2016 http://www.hswebframework.org
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package org.hswebframework.web.service;

import org.hswebframework.web.dao.CrudDao;
import org.hswebframework.web.commons.beans.param.QueryParamBean;
import org.springframework.transaction.annotation.Transactional;

/**
 * TODO 完成注释
 *
 * @author zhouhao
 * @see DefaultDSLQueryService
 * @see DefaultDSLUpdateService
 * @see DefaultDSLDeleteService
 * @see CrudService
 * @see QueryParamBean
 * @see CrudDao
 */
public interface GenericService<B, PK> extends
        DefaultDSLQueryService<B>,
        DefaultDSLUpdateService<B>,
        DefaultDSLDeleteService<PK>,
        CrudService<B, PK, QueryParamBean> {
    @Override
    @Transactional
    CrudDao<B, PK> getDao();
}