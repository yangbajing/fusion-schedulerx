/*
 * Copyright 2019 akka-fusion.com
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

package fusion.schedulerx

import scala.concurrent.duration._

object Constants {
  val SCHEDULERX = "schedulerx"
  val DEFAULT = "default"
  val DEFAULT_TIMEOUT = 2.hours

  object Dispatcher {
    val WORKER_BLOCK = s"$SCHEDULERX.worker.block-dispatcher"
  }
}

object FileNames {
  val APPLICATION_CONF = "application.conf"
  val INSTANCE_JSON = "instance.json"
  val RUN_WORKER_JAR = "run-worker.jar"
}
