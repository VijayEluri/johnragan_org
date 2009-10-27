# Settings specified here will take precedence over those in config/environment.rb

# The test environment is used exclusively to run your application's
# test suite.  You never need to work with it otherwise.  Remember that
# your test database is "scratch space" for the test suite and is wiped
# and recreated between test runs.  Don't rely on the data there!
config.cache_classes = true

# Log error messages when you accidentally call methods on nil.
config.whiny_nils = true

# Show full error reports and disable caching
config.action_controller.consider_all_requests_local = true
config.action_controller.perform_caching             = false

# Disable request forgery protection in test environment
config.action_controller.allow_forgery_protection    = false

# Tell Action Mailer not to deliver emails to the real world.
# The :test delivery method accumulates sent emails in the
# ActionMailer::Base.deliveries array.
config.action_mailer.delivery_method = :test

config.gem "thoughtbot-factory_girl", :lib => "factory_girl", :source => "http://gems.github.com"

module Shoulda
  module ClassMethods
    def with(name, &context_block)
      context("with " + name, &context_block)
    end
    def who(name, &context_block)
      context("who " + name, &context_block)
    end
    def that(name, &context_block)
      context("that " + name, &context_block)
    end

  end
end