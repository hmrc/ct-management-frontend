/*
 * Copyright 2026 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package viewmodels

import play.api.i18n.Messages
import uk.gov.hmrc.govukfrontend.views.viewmodels.breadcrumbs.{Breadcrumbs, BreadcrumbsItem}
import uk.gov.hmrc.govukfrontend.views.viewmodels.content.Text

object PageBreadcrumbs {

  def clientDeleted(implicit messages: Messages): Breadcrumbs =
    // TODO: Add hrefs
    Breadcrumbs(
      items = Seq(
        BreadcrumbsItem(content = Text(messages("Home")), href = Some("/")),
        BreadcrumbsItem(content = Text(messages("Clientlist")), href = Some("/clients/client-list")),
        BreadcrumbsItem(content = Text(messages("View clients")), href = Some("/clients/current-client"))
      )
    )

}
