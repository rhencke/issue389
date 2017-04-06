#!/bin/sh
set -ex

cd plugin
./kobaltw assemble
cd ../projectUsingPlugin
./kobaltw assemble --log 3
cd ..
