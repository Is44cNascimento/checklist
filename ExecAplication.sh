#!/usr/bin/env bash
set -e

# Ajuste estes caminhos conforme seu projeto
FRONTEND_DIR="/home/Isaac/Documentos/checklist/frontend/frontend/"


cleanup() {
  echo "Encerrando processos..."
  kill 0
}
trap cleanup EXIT INT TERM

(cd "$FRONTEND_DIR" && ng serve)

wait
