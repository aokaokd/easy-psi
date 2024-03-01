/*
 * Copyright 2023 Ant Group Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.secretflow.secretpad.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.Where;

/**
 * Node data object
 *
 * @author xiaonan
 * @date 2023/5/25
 */
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "node")
@ToString
@Getter
@Setter
@Where(clause = "is_deleted = 0")
public class NodeDO extends BaseAggregationRoot<NodeDO> {

    /**
     * Node id
     */
    @Id
    @Column(name = "node_id", nullable = false, length = 64)
    private String nodeId;

    /**
     * Node name
     */
    @Column(name = "name", nullable = false, length = 256)
    private String name;

    /**
     * Node authorization
     */
    @Column(name = "auth", columnDefinition = "text")
    private String auth;

    /**
     * Node description
     */
    @Column(name = "description", columnDefinition = "text")
    private String description;

    /**
     * Node certText
     */
    @Column(name = "cert_text", columnDefinition = "text")
    private String certText;

    /**
     * Node remark
     */
    @Column(name = "node_remark", columnDefinition = "text")
    private String nodeRemark;

    private String controlNodeId;
    private String netAddress;

}
